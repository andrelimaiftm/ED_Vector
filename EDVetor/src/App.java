public class App {
    public static void main(String[] args) throws Exception {
        
        VetorObjetos vetor =  new VetorObjetos(2);

        Contato c1 = new Contato("c1", "111-1111", "c1@email.com.br");
        Contato c2 = new Contato("c2", "222-2222", "c2@email.com.br");
        Contato c3 = new Contato("c3", "333-3333", "c3@email.com.br");
        //try {

            vetor.adiciona(c1);
            vetor.adiciona(c2);
            vetor.adiciona(c3);
           // System.out.println(vetor);
            vetor.adiciona("A");
            vetor.adiciona(2);
            System.out.println(vetor);
            /*vetor.adiciona(2);
            vetor.adiciona(4);
            vetor.adiciona(5);
            System.out.println(vetor);
            vetor.adiciona(0, 1);
            System.out.println(vetor);
            vetor.adiciona(2, 3);
            System.out.println(vetor);
            vetor.remover(1);
            System.out.println(vetor);*/
           // System.out.println(vetor.busca(2));
            //System.out.println(vetor.busca("elemento 4"));
            //System.out.println(vetor.toString());
            //System.out.println(vetor.tamanho());
       /*} catch (IllegalAccessException e) {
            e.printStackTrace();
        }*/  
        

    }
}
