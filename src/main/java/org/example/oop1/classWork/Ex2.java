package org.example.oop1.classWork;

public class Ex2 {
    public static void main(String[] args) {
        /**
         * @apiNote
         * Создайте систему управления банковскими счетами, где каждый счёт имеет свой номер, владельца и баланс.
         *
         * У него должны быть:
         * - Аккаунт (включает в себя номер Аккаунта, имя владельца, баланс)
         * - Унаследованные от аккаунта счета(аккаунты) (сберегательный, кредитный)
         * - Main - класс, который и будет являться системой управления счетами.
         * - реализовать методы:
         * 	- deposit(amount) - метод для добавления денежных средств на счет. Принимает один аргумент - сумму депозита.
         * - withdraw(amount) - метод для снятия денежных средств со счета. Принимает один аргумент - сумму снятия.
         * (Выше реализованы представлены сигнатуры общих методов)
         *
         * Для сберегательного счёта:
         * - addInterest() - метод для добавления процентов к балансу. Рассчитывает процентную ставку от
         * текущего баланса и добавляет полученную сумму к балансу.
         * Для кредитного счёта:
         * - calculate_interest() - метод для расчета процентов по кредиту. Должен рассчитывать процентную ставку
         * от текущего баланса и вычитать полученную сумму из баланса. Если баланс отрицательный, то проценты
         * начисляются на отрицательный баланс.
         */
        CreditAccaunt creditAccaunt = new CreditAccaunt(12, "Ivan", 2000.0, 20.0);
        SavingAccaunt savingAccaunt = new SavingAccaunt(10, "qwe", 1000.0, 10.0);
        System.out.println("creditAccaunt.getBalance() = " + creditAccaunt.getBalance());
        creditAccaunt.calculateInterest();
        System.out.println("creditAccaunt.getBalance() = " + creditAccaunt.getBalance());
        System.out.println("savingAccaunt.getBalance() = " + savingAccaunt.getBalance());
        savingAccaunt.addInterest();
        System.out.println("savingAccaunt.getBalance() = " + savingAccaunt.getBalance());
    }
}
