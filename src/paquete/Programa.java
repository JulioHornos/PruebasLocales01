package paquete;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Probando Fetch");
		System.out.println("prueba de uso de GIT");
		
		System.out.println("prueba de add+commit de GIT");
		
		System.out.println("prueba soft reset de GIT");
		
		RamaCaso1 miRamaCaso1 = new RamaCaso1();
		
		miRamaCaso1.pintarRama();
		
		System.out.println("Esta salida no está en la rama Caso 2");
		RamaCaso2 miRamaCaso2 = new RamaCaso2();
		
		System.out.println("añadido print");
		// comentario
		// otro
		
		miRamaCaso2.pintarRama();

	}

}
