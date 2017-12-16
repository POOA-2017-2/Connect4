package logica;

import java.awt.image.BufferedImage;

import conecta4.Ficha;

/*cada funcion recibe el tablero, la posicion x y y de la ficha, y el tipo de 
 * jugador en cada posicion.*/

public class logicaTablero {

	public static void setFicha(Ficha[][] tablero,BufferedImage color,int x,int jugador){
		//System.out.println(x);
		for(int j=5;j>=0;j--){
			if(tablero[j][x].getColor()== null){
				tablero[j][x].setColor(color);
				tablero[j][x].setJugador(jugador);
				// aqui en x lo mando desde la ficha y Y lo mando manualmente aca abajo.
				//                                          x , y  
				System.out.println(DiagonalDerArriba(tablero,x,3,jugador) );
				//System.out.println("" + Ganador(tablero));
				break;
			}
		}
		
		
		
		
		
	}
	public static void llenarTablero(Ficha[][] tablero){
		int x=27;
		int y=120;
		for(int i=0;i<6;i++){
			for(int j=0;j<7;j++){
					tablero[i][j]= new Ficha(null,x,y,60,60,0);
					x+=70;
					if(x>=477){
						x=27;
						y+=70;
					}
					
					
				//	System.out.println(y);
			}
		}
	}
	

	
	public static int horizontalIzq(Ficha[][] ficha,int x, int y,int jugador){
		int i,cont=1;
		if(x>=3){
			for(i=x-1;i>(x-4);i--){
				if(ficha[y][i]!=null&&ficha[y][i].getJugador()== jugador){
					System.out.println("test");
					System.out.println(ficha[y][i].getJugador());	
					cont++;
					System.out.println(cont);
				}
			}
			if(cont == 4)
				return jugador;
			else
				return 0;
		}
		else
			return 0;
	}
	public static int horizontalDer(Ficha[][] ficha,int x, int y,int jugador){
		int i,cont=1;
		if(x<=2){
			for(i=x+1;i<(x+4);i++){
				if(ficha[y][i]!=null&&ficha[y][i].getJugador()== jugador){
					System.out.println("test");
					System.out.println(ficha[y][i].getJugador());	
					cont++;
					System.out.println(cont);
				}
			}
			if(cont == 4)
				return jugador;
			else
				return 0;
		}
		else
			return 0;
	}
	public static int vertical(Ficha[][] ficha,int y, int x,int jugador){
		int i,cont=0;
		if(y<=1){
			for(i=y;i<(y+4);i++){
				if(ficha[i][x]!=null&&ficha[i][x].getJugador()== jugador){
					System.out.println("test");
					System.out.println(ficha[i][x].getJugador());	
					cont++;
					System.out.println(cont);
				}
			}
			if(cont == 4)
				return jugador;
			else
				return 0;
		}
		else
			return 0;
	}
	public static int DiagonalIzqArriba(Ficha[][] ficha,int x, int y,int jugador){
		int i,cont=1;
		if(x>=3){
			//System.out.println("hola");
			for(i=y;i>(y-3);i--){
				if(ficha[i][i]!=null&&ficha[i][i].getJugador()== jugador){
					System.out.println("test");
					System.out.println(ficha[i][i].getJugador());	
					cont++;
					System.out.println(cont);
				}
			}
			if(cont == 4)
				return jugador;
			else
				return 0;
		}
		else
			return 0;
	}
	public static int DiagonalIzqAbajo(Ficha[][] ficha,int x, int y,int jugador){
		int i,cont=1;
		if(y<=2&&x>=3){
			System.out.println("------");
			for(i=y;i<=(y+2);i++){
				if(ficha[i][x]!=null&&ficha[i][x].getJugador()== jugador){
					x--;
					System.out.println("test");
					System.out.println(ficha[i][x].getJugador());	
					cont++;
					System.out.println(cont);
				}
			}
			if(cont == 4)
				return jugador;
			else
				return 0;
		}
		else
			return 0;
	}
	//Las funciones hasta eeste punto si sirven, pero las siguientes
	//no puedo y ando batallando
	//Pendiente-----------------------------------------------------------
	public static int DiagonalDerAbajo(Ficha[][] ficha,int x, int y,int jugador){
		int i,cont=1;
		
		if(x<=3){
			
			System.out.println("------");
		
			for(i=y+1;i<=(y+3);i++){
				
				System.out.println(" "+ x + i );
				x++;
			if(ficha[x][i]!=null&&ficha[x][i].getJugador()== jugador){
				
					System.out.println("test");
					System.out.println(ficha[x][i].getJugador());	
					
					cont++;
					
					System.out.println(cont);
				}
			}
			if(cont == 4)
				return jugador;
			else
				x--;
				return 0;
	}
		else
			return 0;
	}

	public static int DiagonalDerArriba(Ficha[][] ficha,int x, int y,int jugador){
		int i, cont=1;
		
		
		if(x<=4){
			System.out.println("hola");
			System.out.println(" "+x+ y);
			for(i=y-1;y<=0;y++){
				x++;
				System.out.println(" "+x + i);
				if(ficha[x][i]!=null&&ficha[x][i].getJugador()== jugador){
					System.out.println("test");
					System.out.println(ficha[x][i].getJugador());	
					cont++;
					
					System.out.println(cont);
				}
			}
			if(cont == 4)
				return jugador;
			else
				return 0;
		}
		else
			return 0;
	}

}