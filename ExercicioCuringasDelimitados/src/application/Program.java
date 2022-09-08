package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {
	
	public static void main(String[] args) {
		
		/*Curingas delimitados*/
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total área: " + totalArea(myShapes));
		System.out.println("Total área: " + totalArea(myCircles));
		
		//método para copiar uma lista para uma mais genérica
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		copy(myInts, myObjs);
		copy(myDoubles, myObjs);
		
		printList(myObjs);
	}
	
	//vai aceitar no parametro uma lista de shape ou qualquer tipo que seja subtipo de shape
	//não vai aceitar adicionar na lista, pois o que se vai adicionar pode não ser do tipo da lista passada por parametro
	public static double totalArea(List<? extends Shape> list) {
		
		double sum = 0.0;
		for(Shape s : list) {
			sum += s.area();
		}
		
		return sum;
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		
		for(Number number : source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		
		for(Object obj : list) {
			System.out.print(obj + " \n");			
		}		
	}
}
