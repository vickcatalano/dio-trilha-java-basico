public class AboutMe {

    public static void main(String[] args) {

        String nome = args [0];
        String sobrenome = args [1];
        int idade = integer.valueOf (args [2]);
        double altura = double.valueOf (args [3]);
        
        System.out.println("Olá, me chamo "+ nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("E minha altura é " + altura + " cm ");
    

    }
}