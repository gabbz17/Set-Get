import java.util.Scanner;

public class conta {
    public static void main(String[] args) {
        Account c = new Account();

        Scanner e = new Scanner(System.in);

        System.out.println("Informe sua altura: ");
        c.setaltura(e.nextDouble());
        System.out.println("Informe seu nome: ");
        e.nextLine();
        c.setname(e.nextLine());
        System.out.println("Informe sua idade: ");
        c.setidade(e.nextInt());
        System.out.println("Informe seu sexo: ");
        e.nextLine();
        c.setsexo(e.nextLine());
        System.out.println("Informe seu email para contato: ");
        e.nextLine();
        c.setemail(e.nextLine());

        System.out.printf("%s tem %d anos, possui o sexo %s e possui %f de altura%nEmail para contato: %s ",
                c.getname(),
                c.getidade(), c.getsexo(),
                c.getaltura(), c.getemail());

    }
}
