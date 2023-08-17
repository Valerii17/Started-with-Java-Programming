package org.example.exceptions.classWork3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main6 {
    /*
    Р—Р°РїРёС€РёС‚Рµ РІ С„Р°Р№Р» СЃР»РµРґСѓСЋС‰РёРµ СЃС‚СЂРѕРєРё:
    РђРЅРЅР°=4
    Р•Р»РµРЅР°=5
    РњР°СЂРёРЅР°=6
    Р’Р»Р°РґРёРјРёСЂ=?
    РљРѕРЅСЃС‚Р°РЅС‚РёРЅ=?
    РРІР°РЅ=4
    Р РµР°Р»РёР·СѓР№С‚Рµ РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ СЃС‡РёС‚С‹РІР°РµС‚ РґР°РЅРЅС‹Рµ РёР· С„Р°Р№Р»Р° Рё СЃРѕС…СЂР°РЅСЏРµС‚ РІ РґРІСѓРјРµСЂРЅС‹Р№ РјР°СЃСЃРёРІ
    (Р»РёР±Рѕ HashMap, РµСЃР»Рё СЃС‚СѓРґРµРЅС‚С‹ СЃ РЅРёРј Р·РЅР°РєРѕРјС‹). Р’ РѕС‚РґРµР»СЊРЅРѕРј РјРµС‚РѕРґРµ РЅСѓР¶РЅРѕ Р±СѓРґРµС‚ РїСЂРѕР№С‚Рё РїРѕ СЃС‚СЂСѓРєС‚СѓСЂРµ РґР°РЅРЅС‹С…,
    РµСЃР»Рё СЃРѕС…СЂР°РЅРµРЅРѕ Р·РЅР°С‡РµРЅРёРµ ?, Р·Р°РјРµРЅРёС‚СЊ РµРіРѕ РЅР° СЃРѕРѕС‚РІРµС‚СЃС‚РІСѓСЋС‰РµРµ С‡РёСЃР»Рѕ.
    Р•СЃР»Рё РЅР° РєР°РєРѕРј-С‚Рѕ РјРµСЃС‚Рµ РІСЃС‚СЂРµС‡Р°РµС‚СЃСЏ СЃРёРјРІРѕР», РѕС‚Р»РёС‡РЅС‹Р№ РѕС‚ С‡РёСЃР»Р° РёР»Рё ?, Р±СЂРѕСЃРёС‚СЊ РїРѕРґС…РѕРґСЏС‰РµРµ РёСЃРєР»СЋС‡РµРЅРёРµ.
    Р—Р°РїРёСЃР°С‚СЊ РІ С‚РѕС‚ Р¶Рµ С„Р°Р№Р» РґР°РЅРЅС‹Рµ СЃ Р·Р°РјРµРЅРµРЅРЅС‹РјРё СЃРёРјРІРѕР»Р°РјРё ?.
     */
    public static void main(String[] args) {
        readAndWrite();
    }

    private static void readAndWrite() {
        try {
            Map<String, String> map = readFile("test.txt");
            replaceText(map);
            saveToFile("t/t/t/test1.txt", map);
        } catch (ReadFileException e){
            e.printStackTrace();
        } catch (SaveFileException e){
            e.printStackTrace();
        } catch (IllegalArgumentException e){
            System.out.println("Неверный формат записи");
            System.out.println(e.getMessage());
        }
    }

    private static void saveToFile(String filePath, Map<String, String> map) throws SaveFileException {
        try (FileWriter writer = new FileWriter(filePath)){
            for (Map.Entry<String, String> entry: map.entrySet()){
                writer.write(entry.toString());
                writer.write("\n");
                writer.flush();
            }
        } catch (IOException e){
            throw new SaveFileException("Запись в файл не удалась", e);
        }
    }

    private static void replaceText(Map<String, String> map){
        for (Map.Entry<String, String> entry: map.entrySet()){
            String key = entry.getKey();
            String val = entry.getValue();
            if (val.equals("?")){
                entry.setValue(String.valueOf(key.length()));
            } else if (!val.matches("[0-9]+")) {
                throw new IllegalArgumentException("Ошибка в строке: " + entry);
            }
        }
    }

    private static Map<String, String> readFile(String filePath) throws ReadFileException {
        Map<String, String> map = new LinkedHashMap<>();
        File file = new File(filePath);
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                String[] temp = line.split("=");
                map.put(temp[0], temp[1]);
            }
        } catch (IOException e){
            throw new ReadFileException("Чтение файла не удалось", e);
        }
        return map;
    }
}

