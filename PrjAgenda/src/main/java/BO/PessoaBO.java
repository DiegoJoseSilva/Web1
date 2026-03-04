package BO;

import Objetos.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class PessoaBO {
    private ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    public void salvar(Pessoa p){
        listaPessoas.add(p);
    }
    
    
    public ArrayList<Pessoa>getListaPessoas(){
        return listaPessoas;
    }
    
    public Pessoa buscarPorNome(String nome){
        for(Pessoa p : listaPessoas){
            if (p.getNome().equalsIgnoreCase(nome)) {
            return p;
            }
        }
        return null;
    }
    
    public boolean editar(String nome, String novoTelefone){
        for (Pessoa p : listaPessoas){
            if(p.getNome().equalsIgnoreCase(nome)){
                p.setTelefone(novoTelefone);
                return true;
            }
        }
        return false;
    }
    
    public boolean excluir(String nome){
        for (Pessoa p: listaPessoas){
            if(p.getNome().equalsIgnoreCase(nome)){
                listaPessoas.remove(p);
                return true;
            }
        }
        return false;
    }
    
    public List<Pessoa> listar() {
         return listaPessoas;
    }

}
