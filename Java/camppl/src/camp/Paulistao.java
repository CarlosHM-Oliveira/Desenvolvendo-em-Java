package camp;

import java.util.Scanner;

public class Paulistao {

	public static void main(String[] args) {

		int cor3,cpt3,sto3,spt3,plm3,ppt3,gol1,gol2,jg1,jg2;
		Scanner input= new Scanner(System.in);
		char time1,time2;
		
		//Valores
		cor3=0;
		cpt3=0;
		sto3=0;
		spt3=0;
		plm3=0;
		ppt3=0;
		jg1=1;
		jg2=1;
		
		//1 Rodada
		
		for (int i = 0;i<2;i++) {
		System.out.println("Primeira Rodada "+jg1+"ºJogo");
		System.out.print("Qual time jogou?(Entre C:Corintians/S:Santos/P:Palmeiras)");
		 time1 = input.next().charAt(0);
		 System.out.print("E o segundo?(Entre C:Corintians/S:Santos/P:Palmeiras)");
		 time2 = input.next().charAt(0);
		 System.out.print("Qual Resultado?(Quantidade de gols do "+time1+")");
		 gol1= input.nextInt();
		 System.out.print("Qual Resultado?(Quantidade de gols do "+time2+")");
		 gol2= input.nextInt();
		 
		 
		 if (gol1>gol2){
			 switch (time1) {
		      case 'C':
		       cor3=cor3+gol1;
		       cpt3=cor3+3;
		        break;
		      case 'S':
			   sto3=cor3+gol1;
			   spt3=spt3+3;
		        break;
		      case 'P':
			    plm3=plm3+gol1;
			    ppt3=ppt3+3;
		        break;
		      default:
		        System.out.println("Time inválido, de outro run");
		        break;
		    }
		 }if (gol1<gol2){
			 switch (time2) {
		      case 'C':
		       cor3=cor3+gol2;
		       cpt3=cor3+3;
		        break;
		      case 'S':
			   sto3=cor3+gol2;
			   spt3=spt3+3;
		        break;
		      case 'P':
			    plm3=plm3+gol2;
			    ppt3=ppt3+3;
		        break;
		      default:
		        System.out.println("Time inválido, de outro run");
		        break;
		    }
		 }else if(gol1==gol2){
				 switch (time2) {
			      case 'C':
			       cor3=cor3+gol2;
			       cpt3=cor3+1;
			        break;
			      case 'S':
				   sto3=cor3+gol2;
				   spt3=spt3+1;
			        break;
			      case 'P':
				    plm3=plm3+gol2;
				    ppt3=ppt3+1;
			        break;
			      default:
			        System.out.println("Time inválido, de outro run");
			        break;
			    }  switch (time1) {
				      case 'C':
				       cor3=cor3+gol1;
				       cpt3=cor3+1;
				        break;
				      case 'S':
					   sto3=cor3+gol1;
					   spt3=spt3+1;
				        break;
				      case 'P':
					    plm3=plm3+gol1;
					    ppt3=ppt3+1;
				        break;
				      default:
				        System.out.println("Time inválido, de outro run");
				        break;
				    }
		  }
		 jg1+=1;
		}
		
		System.out.println("Final Primeira Rodada");
		System.out.println("        Campeonato Paulista ");
		System.out.println("  Times        Pontos        Gols");
		System.out.println("Corinthians" + "      " + cor3 + "            "+ cpt3);
		System.out.println("Santos" + "           " + sto3 + "            "+ spt3);
		System.out.println("Palmeiras" + "        " + plm3 + "            "+ ppt3);
		System.out.println("");
		
		//2 Rodada
		
		for (int g = 0;g<2;g++) {
			System.out.println("Segunda Rodada "+jg2+"ºJogo");
			System.out.print("Qual time jogou?(Entre C:Corintians/S:Santos/P:Palmeiras)");
			 time1 = input.next().charAt(0);
			 System.out.print("E o segundo?(Entre C:Corintians/S:Sanros/P:Palmeiras)");
			 time2 = input.next().charAt(0);
			 System.out.print("Qual Resultado?(Quantidade de gols do "+time1+")");
			 gol1= input.nextInt();
			 System.out.print("Qual Resultado?(Quantidade de gols do "+time2+")");
			 gol2= input.nextInt();
			 
			 
			 if (gol1>gol2){
				 switch (time1) {
			      case 'C':
			       cor3=cor3+gol1;
			       cpt3=cor3+3;
			        break;
			      case 'S':
				   sto3=cor3+gol1;
				   spt3=spt3+3;
			        break;
			      case 'P':
				    plm3=plm3+gol1;
				    ppt3=ppt3+3;
			        break;
			      default:
			        System.out.println("Time inválido, de outro run");
			        break;
			    }
			 }if (gol1<gol2){
				 switch (time2) {
			      case 'C':
			       cor3=cor3+gol2;
			       cpt3=cor3+3;
			        break;
			      case 'S':
				   sto3=cor3+gol2;
				   spt3=spt3+3;
			        break;
			      case 'P':
				    plm3=plm3+gol2;
				    ppt3=ppt3+3;
			        break;
			      default:
			        System.out.println("Time inválido, de outro run");
			        break;
			    }
			 }else if(gol1==gol2){
					 switch (time2) {
				      case 'C':
				       cor3=cor3+gol2;
				       cpt3=cor3+1;
				        break;
				      case 'S':
					   sto3=cor3+gol2;
					   spt3=spt3+1;
				        break;
				      case 'P':
					    plm3=plm3+gol2;
					    ppt3=ppt3+1;
				        break;
				      default:
				        System.out.println("Time inválido, de outro run");
				        break;
				    }  switch (time1) {
					      case 'C':
					       cor3=cor3+gol1;
					       cpt3=cor3+1;
					        break;
					      case 'S':
						   sto3=cor3+gol1;
						   spt3=spt3+1;
					        break;
					      case 'P':
						    plm3=plm3+gol1;
						    ppt3=ppt3+1;
					        break;
					      default:
					        System.out.println("Time inválido, de outro run");
					        break;
					    }
			  }
			 jg2+=1;
			}
		
		//Final
		
		System.out.println("Final Segunda Rodada");
		System.out.println("        Campeonato Paulista ");
		System.out.println("  Times        Pontos        Gols");
		System.out.println("Corinthians" + "      " + cor3 + "            "+ cpt3);
		System.out.println("Santos" + "           " + sto3 + "            "+ spt3);
		System.out.println("Palmeiras" + "        " + plm3 + "            "+ ppt3);
		System.out.println("");
		}
	}

