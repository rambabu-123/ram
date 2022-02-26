package ram;
public class transpose{  
public static void main(String args[]){  
 
int matrix[][]={{1,3,8},{6,4,3},{3,8,5}};     
int transpose[][]=new int[3][3];  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
transpose[i][j]=matrix[j][i];  
}    
}    
System.out.println("Printing Matrix without transpose:");  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
System.out.print(matrix[i][j]+" ");    
}    
System.out.println();    
}    
System.out.println("Printing Matrix After Transpose:");  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
System.out.print(transpose[i][j]+" ");    
}    
System.out.println();  
}    
}}  
