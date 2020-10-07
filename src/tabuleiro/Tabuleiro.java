package tabuleiro;

public class Tabuleiro {
	Casa casa [][];
	public Casa getCasa(int l, int c) {
		return casa[l][c];
	}
	public void setCasa(Casa Casa, int l, int c) {
		this.casa[l][c] = Casa;
	}
	public void criar(){
            casa = new Casa[8][8];
           
            System.out.println("   1 2 3 4 5 6 7 8");
            
           //percorrendo linha da matriz
            for (int i=0;i<8;++i){  
                String str = String.valueOf(i+1);
                System.out.println(str+" | | | | | | | | |");
              
                //percorrendo colunas da matriz
                for (int j=0;j<8;++j){
                    casa[i][j]= new Casa();
                    casa[i][j].setStatus(true);
                    if ((i+j)%2==0){
                        casa[i][j].setCor("Preta");
                    }else{
                        casa[i][j].setCor("Branca");
                    }
                }
            }
	}
}
