package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.example.genericLinkedList.GenericLinkedList;

public class Main {
    private final static Logger LOGGER = LogManager.getLogger(GenericLinkedList.class);
    public static void main(String[] args){
        //initializing integer list
        GenericLinkedList<Integer> integerList = new GenericLinkedList<>();
        GenericLinkedList<String> stringList = new GenericLinkedList<>();

        //messing with integer elements
        integerList.addFront(11);
        LOGGER.info("You added 11 to the front: ");
        integerList.printNode();

        integerList.addFront(23);
        LOGGER.info("You added 23 to the front: ");
        integerList.printNode();

        integerList.addBack(50);
        LOGGER.info("You added 50 to the back: ");
        integerList.printNode();

        integerList.addAnywhereInlist(2, 90);
        LOGGER.info("You added 90 to position 2: ");
        integerList.printNode();

        integerList.addFront(37);
        LOGGER.info("You added 37 to the front: ");
        integerList.printNode();

        integerList.deleteNodeBack();
        LOGGER.info("You deleted the last node: ");
        integerList.printNode();

        integerList.deleteNodeFront();
        LOGGER.info("You deleted the first node: ");
        integerList.printNode();

        integerList.isNodeInList(23);
        LOGGER.info("Node 23 is in the list: ");
        integerList.printNode();

        integerList.deleteNodeAnywhere(2);
        LOGGER.info("You deleted a node at position 2");
        integerList.printNode();


        //messing with string elements
        stringList.addFront("Dog");
        LOGGER.info("You added Dog to the front: ");
        stringList.printNode();

        stringList.addFront("Cat");
        LOGGER.info("You added Cat the front: ");
        stringList.printNode();

        stringList.addBack("Budgie");
        LOGGER.info("You added Budgie to the back: ");
        stringList.printNode();

        stringList.addAnywhereInlist(2, "Falcon");
        LOGGER.info("You added Falcon to position 2: ");
        stringList.printNode();

        stringList.addFront("Bear");
        LOGGER.info("You added Bear to the front: ");
        stringList.printNode();

        stringList.deleteNodeBack();
        LOGGER.info("You deleted the last node: ");
        stringList.printNode();

        stringList.deleteNodeFront();
        LOGGER.info("You deleted the first node: ");
        stringList.printNode();

        stringList.isNodeInList("Dog");
        LOGGER.info("Node Dog is in the list: ");
        stringList.printNode();

        stringList.deleteNodeAnywhere(2);
        LOGGER.info("You deleted a node at position 2");
        stringList.printNode();
    }
}
