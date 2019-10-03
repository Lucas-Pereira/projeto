
package javaapplication2;
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {   
        ArrayList<Pessoa> pessoa = new ArrayList<>();
                Pessoa p;

                Scanner entrada;

      
        for(int i=0;i<3;i++){
            p = new Pessoa();
            
            entrada = new Scanner(System.in);
            p.setNome(entrada.next());
            p.setIdade(entrada.nextInt());
            p.setCpf(entrada.next());
            pessoa.add(p);
        }
        for(int i=0;i<pessoa.size();i++){
                    

            System.out.println(i);
                    System.out.println(pessoa.get(i).getNome());

        System.out.println(pessoa.get(i).getIdade());
        }
               
    }

   
}

class Produto{
    private String nome;
    private String desc;
    private double preco;
    
    public Produto(){
        preco = 0;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    public String getDesc(){
        return this.desc;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }
}/*FIM CLASSE Produto*//*FIM CLASSE Produto*/

class Pessoa{
    
    private String nome;
    private int idade;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}  