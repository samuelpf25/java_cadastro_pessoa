/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastropessoa;

import javax.swing.JOptionPane;

/**
 *
 * @author samuel
 */
public class Principal {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        Empresa empresa = new Empresa();
        String opcao="0";        

        while (!opcao.equals("3")){
            
            opcao=JOptionPane.showInputDialog("Digite a opção: (1)Cadastrar Pessoa; (2)Cadastrar Empresa; (3)Sair");
            //tratamento de entrada
            while (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3")){
                opcao=JOptionPane.showInputDialog("Opção Inválida! Digite a opção: (1)Cadastrar Pessoa; (2)Cadastrar Empresa; (3)Sair");
            }


            if (opcao.equals("1")){
            //Pessoa
                pessoa.setNome(JOptionPane.showInputDialog("Digite o nome:"));
                pessoa.setEndereco(JOptionPane.showInputDialog("Digite o endereço:"));
                pessoa.setTelefone(JOptionPane.showInputDialog("Digite o telefone:"));                
                pessoa.setCpf(JOptionPane.showInputDialog("Digite o cpf:"));
                JOptionPane.showMessageDialog(null, pessoa.getNome() + " | " + pessoa.getEndereco() + " | " + pessoa.getTelefone() + " | " + pessoa.getCpf());
            }else if(opcao.equals("2")){
            //Empresa
                empresa.setNome(JOptionPane.showInputDialog("Digite o nome:"));
                empresa.setEndereco(JOptionPane.showInputDialog("Digite o endereço:"));
                empresa.setTelefone(JOptionPane.showInputDialog("Digite o telefone:")); 
                empresa.setCnpj(JOptionPane.showInputDialog("Digite o cnpj:"));
                empresa.setNome_fantasia(JOptionPane.showInputDialog("Digite o nome fantasia:"));
                JOptionPane.showMessageDialog(null, empresa.getNome() + " | " + empresa.getEndereco() + " | " + empresa.getTelefone() + " | " + empresa.getCnpj() + " | " + empresa.getNome_fantasia());
            }
    }        
        
    }
}
