package consultorio;

import java.util.ArrayList;
import java.util.InputMismatchException;
import util.Console;

public class Consultorio {

    public static void main(String[] args) {
        ArrayList<Paciente> listaPacientes = new ArrayList<>();
        
        int op = 0;
        do{
            System.out.println("Menu:");
            System.out.println("1- Novo Paciente");
            System.out.println("2- Todos Pacientes");
            System.out.println("3- Sair");
            try{
                op = Console.scanInt("Opção: ");

                switch(op){
                    case 1: 
                        listaPacientes.add(cadastrarPaciente());
                        break;
                    case 2: 
                        listarPacientes(listaPacientes);
                        break;
                    case 3:
                        System.out.println("Finalizando a aplicação ...");
                        break;
                    default:
                        System.err.println("Opção Inválida!");
                }
            } catch (InputMismatchException exc){
                System.err.println("Opção Inválida!");
            }
        }while(op != 3);
    }
    
    
    private static Paciente cadastrarPaciente(){
        String rg = Console.scanString("RG: ");
        String nome = Console.scanString("Nome: ");
        String dataNascimento = Console.scanString("Data Nascimento: ");
        return new Paciente(rg, nome, dataNascimento);
    }
    
    private static void listarPacientes(ArrayList<Paciente> listaPacientes){
        for(Paciente p: listaPacientes){
            System.out.println("RG: "+p.getRg());
            System.out.println("Nome: "+p.getNome());
            System.out.println("Data Nascimento: "+p.getDataNascimento()+"\n");
            
        }
    }
}
