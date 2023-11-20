package Herança;

import java.util.Date;

public class Funcionario {

    private String nome;
    private String cpf;
    private Date dataNascimento;
    private float salario;
    
    private String getNome(){
        return nome;
    }
    private void setNome(String nome){
        this.nome = nome;
    }
    private String getcpf(){
        return cpf;
    }
    private void setcpf(String cpf){
        this.cpf = cpf;
    }
    private Date getdataNascimento(){
        return dataNascimento;
    }
    private void setdataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    private float getsalario(){
        return salario;
    }
    private void setsalario(Float salario){
        this.salario = salario
    }
}

