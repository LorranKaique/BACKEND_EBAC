public class HelloWord1 {
    
    public static void main(String[] args) {
        String ambiente = args[0];
        if (ambiente.equals("DEV")){
            System.out.print("Executando em DEV");
        }else if (ambiente.equals("TEST")) {
            System.out.print("Executando em TESTE");
        } else {
            System.out.print(ambiente);
        }
    }
}