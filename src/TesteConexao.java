public class TesteConexao {

    public static void main(String[] args) {

    	// tratamento com autocloseable
    	try(Conexao conexao = new Conexao() ){
    	    conexao.leDados();
    	} catch(IllegalStateException ex){
    	    System.out.println("Deu erro na conex�o");
    	}
    	
    	// Tratamento tradicional
    	Conexao con = null;
    	try{
    	    con = new Conexao();
    	    con.leDados();
    	    con.close();
    	} catch(IllegalStateException ex){
    	    System.out.println("Deu erro na conex�o");
    	} finally {
    		if (con != null) {
    			con.close();	
    		}
    	}
    	
    }
}