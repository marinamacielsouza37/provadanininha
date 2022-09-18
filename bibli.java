public class bibli {
    private int Codigos;
       private String Livro;
       private String Autor;
       private int Paginas;
    public bibli (int Codigos,String Livro,String Autor,int Paginas){
        this.Codigos = Codigos;
        this.Livro = Livro;
        this.Autor = Autor;
        this.Paginas = Paginas;
      }
    public int getCodigos() {
        return Codigos;
    }
    public void setCodigos(int codigos) {
        Codigos = codigos;
    }
    public String getLivro() {
        return Livro;
    }
    public void setLivro(String livro) {
        Livro = livro;
    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String autor) {
        Autor = autor;
    }
    public int getPaginas() {
        return Paginas;
    }
    public void setPaginas(int paginas) {
        Paginas = paginas;
    }
      
    
    
    
    
}