import exceprions.WrongAccountException;
import exceprions.WrongCurrencyException;
import exceprions.WrongOperationException;

public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();
        System.out.println("1");
        try {
            bankApplication.process("accountId000", 50, "USD");
        } catch (WrongAccountException e) {
            System.out.println("Такого акаунту не існує");
        } catch (WrongCurrencyException e) {
            System.out.println("Акаунт має рахунок в іншій валюті");
        } catch (WrongOperationException e) {
            System.out.println("Акаунт не має достатньо коштів");
        } catch (Exception e) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
        System.out.println("2");
        try {
            bankApplication.process("accountId003", 250, "HRV");
        } catch (WrongAccountException e) {
            System.out.println("Такого акаунту не існує");
        } catch (WrongCurrencyException e) {
            System.out.println("Акаунт має рахунок в іншій валюті");
        } catch (WrongOperationException e) {
            System.out.println("Акаунт не має достатньо коштів");
        } catch (Exception e) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
            System.out.println("3");
            try {
                bankApplication.process("accountId001", 50, "EUR");
            } catch (WrongAccountException e) {
                System.out.println("Такого акаунту не існує");
            } catch (WrongCurrencyException e) {
                System.out.println("Акаунт має рахунок в іншій валюті");
            } catch (WrongOperationException e) {
                System.out.println("Акаунт не має достатньо коштів");
            } catch (Exception e) {
                System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
            } finally {
                System.out.println("Дякуємо, що скористалися нашим сервісом");
                System.out.println("4");
                try {
                    bankApplication.process("accountId001", 50, "USD");
                } catch (WrongAccountException e) {
                    System.out.println("Такого акаунту не існує");
                } catch (WrongCurrencyException e) {
                    System.out.println("Акаунт має рахунок в іншій валюті");
                } catch (WrongOperationException e) {
                    System.out.println("Акаунт не має достатньо коштів");
                } catch (Exception e) {
                    System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
                } finally {
                    System.out.println("Дякуємо, що скористалися нашим сервісом");
                    System.out.println("4");
                    try {
                        bankApplication.process("accountId001", 50, "USD");
                    } catch (WrongAccountException e) {
                        System.out.println("Такого акаунту не існує");
                    } catch (WrongCurrencyException e) {
                        System.out.println("Акаунт має рахунок в іншій валюті");
                    } catch (WrongOperationException e) {
                        System.out.println("Акаунт не має достатньо коштів");
                    } catch (Exception e) {
                        System.out.println("Сталася помилка при процесінгу, спробуйте ще раз");
                    } finally {
                        System.out.println("Дякуємо, що скористалися нашим сервісом");
                    }
                }
            }
        }
    }
}
