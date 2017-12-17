package logica;

import java.awt.image.BufferedImage;

import conecta4.Ficha;

/*cada funcion recibe el tablero, la posicion x y y de la ficha, y el tipo de 
 * jugador en cada posicion.*/

public class logicaTablero {

	public static int setFicha(Ficha[][] tablero,BufferedImage color,int x,int jugador){
		////system.out.println(x);
		for(int j=5;j>=0;j--){
			if(tablero[j][x].getColor()== null){
				tablero[j][x].setColor(color);
				tablero[j][x].setJugador(jugador);
				int resultadoValida=valida(tablero,x,j,jugador);
				//System.out.println(resultadoValida);
				if(resultadoValida==1||resultadoValida==2){
				//	System.out.println(resultadoValida);
					return jugador;
				}
				break;
			}
		}
	return 0;
	}		
	public static int valida(Ficha[][] ficha, int x, int y,int jugador)	{
		int num;
		
		num = vertical(ficha,x,y,jugador);
		if(num!=0)
			return num;
		num=horizontalIzq(ficha,x,y,jugador);
		if(num!=0)
			return num;
	
		num=horizontalDer(ficha,x,y,jugador);
		if(num!=0)
			return num;
		//num=DiagonalIzqArriba(ficha,x,y,jugador);
		//num=DiagonalIzqAbajo(ficha,x,y,jugador);
		//num=DiagonalDerAbajo(ficha,x,y,jugador);
		//num=DiagonalDerArriba(ficha,x,y,jugador);
		//System.out.println(num);
		return num;
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
					
					
				//	//system.out.println(y);
			}
		}
	}
	

	
	public static int horizontalIzq(Ficha[][] ficha,int x, int y,int jugador){
		int i,cont=1;
		if(x>=3){
			for(i=x-1;i>(x-4);i--){
				if(ficha[y][i]!=null&&ficha[y][i].getJugador()== jugador){
				//	//system.out.println("test");
					////system.out.println(ficha[y][i].getJugador());	
					cont++;
					//system.out.println(cont);
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
		if(x<=3){
			for(i=x+1;i<(x+4);i++){
				if(ficha[y][i]!=null&&ficha[y][i].getJugador()== jugador){
					//system.out.println("test");
					//system.out.println(ficha[y][i].getJugador());	
					cont++;
					//system.out.println(cont);
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
	
	public static int vertical(Ficha[][] ficha,int x, int y,int jugador){
		int i,cont=0;
		if(y<=2){
			for(i=y;i<(y+4);i++){
				if(ficha[i][x]!=null&&ficha[i][x].getJugador()== jugador){
					//system.out.println("test");
					//system.out.println(ficha[i][x].getJugador());	
					cont++;
					//system.out.println(cont);
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
		int i,cont=1,temp = y;
		if(x>=3){
			for(i=x-1;i>(x-4);i--){
				temp--;
				//system.out.println(" "+i + temp);
				if(ficha[i][temp]!=null&&ficha[i][temp].getJugador()== jugador){
					//system.out.println("test");
					//system.out.println(ficha[i][temp].getJugador());	
					cont++;
					//system.out.println(cont);
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
			//system.out.println("------");
			for(i=y;i<=(y+2);i++){
				if(ficha[i][x]!=null&&ficha[i][x].getJugador()== jugador){
					x--;
					//system.out.println("test");
					//system.out.println(ficha[i][x].getJugador());	
					cont++;
					//system.out.println(cont);
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
		//system.out.println(x+","+y);
		if(x<=3 && y<3){
			
			//system.out.println("------");
		
			for(i=y+1;i<(y+4);i++){
				
				//system.out.println(" "+ x + i );
				x++;
			if(ficha[i][x]!=null&&ficha[i][x].getJugador()== jugador){
				
					//system.out.println("test");
					//system.out.println(ficha[i][x].getJugador());	
					
					cont++;
					
					//system.out.println(cont);
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
		
		
		if(x<4 && y>2){
			//system.out.println("hola");
			//system.out.println(" "+x+ y);
			for(i=y-1;i>(y-4);i--){
				x++;
				//system.out.println(" "+x + i);
				if(ficha[i][x]!=null&&ficha[i][x].getJugador()== jugador){
					//system.out.println("test");
					cont++;
					//system.out.println(cont);
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