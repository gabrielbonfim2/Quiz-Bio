import java.util.LinkedList;
import java.util.Queue;

public class Exer {
    public static void main(String[] args) {

        Queue<String> animalQueue = new LinkedList<>();
        animalQueue.add("caramujo");
        animalQueue.add("lagosta");
        animalQueue.add("tigre");
        String removedElement = animalQueue.remove();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Elements of queue: " + animalQueue);
        String head = animalQueue.peek();
        System.out.println("Head of queue: " + head);
        int size = animalQueue.size();
        System.out.println("Size of queue: " + size);
    }
}
