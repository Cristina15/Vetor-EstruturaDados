package vetores;

/**
 *
 * @author Vitoria Cristina - TADS B 15/02
 *  materia estrutura de dados
 */
public class Vetores {

    private int valor;
    private int tamanho;
    private int[] v1;

    public int tamanhoVetor(int[] v1) {
        int tam = 0;
        for (int i = 0; i < v1.length; i++) {
            tam += 1;
        }
        tamanho = tam;
        return tamanho;

    }

    public int buscar(int valor) {
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] == valor) {
                return v1[i];
            }
            
        }
        return 0;
    }

    public void remover(int valor){
        if( v1!= null){
            if(buscar(valor)!= 0){
                 for(int i = 0; i < v1.length; i++){
                if(v1[i] == valor){
                    v1[i]=0;
            }
            
                
            }
        }
    }
}
    public void inserir(int valor){
        for(int i = 0; i<v1.length; i++){
            if(v1[i] == 0){
                v1[i] = valor;
            }
        }

    }
   public int maiorVetor(){
           int maior = 0;
            for(int i=0; i< v1.length; i++){
                if(v1[i] > maior){
                    maior = v1[i];
                    
                }
            }
                return maior;
            }
        

        public int menorVetor(){
           int menor = 0;
            for(int i=0; i< v1.length; i++){
                if(v1[i] < menor){
                    menor = v1[i];
                    
                }
            }
                return menor;
            }
        }
        


    


