//package 
//import .SerializableClasses.*;

import java.io.IOException;
import java.io.Serializable;


public class Main {



    public static void main(String[] args) throws IOException {
        Angel angel = new Angel("Thesis","Raphael",18725);
        Demon demon = new Demon("Lathif","Samael",29717);
        Human human = new Human("Tom","Will",29);
        HumanNotSerializable buggedHuman = new HumanNotSerializable("Bugowsky","Bug",666);

        // TEST

        Serializer.Serialization.Serialzie(angel,angel.getName());
        Serializer.Serialization.Serialzie(demon,demon.getName());
        Serializer.Serialization.Serialzie(human,human.getName());

        Angel angelLOAD = null;
        Demon demonLOAD = null;
        Human humanLOAD = null;

        angelLOAD = Serializer.Serialization.Deserialize(angelLOAD,angel.getName());
        System.out.println("LOADED:" + angelLOAD.getName());
        demonLOAD = Serializer.Serialization.Deserialize(demonLOAD,demon.getName());
        System.out.println("LOADED:" + demonLOAD.getName());
        humanLOAD = Serializer.Serialization.Deserialize(humanLOAD,human.getName());
        System.out.println("LOADED:" + humanLOAD.getName());


        // NOT SERIALIZABLE
        try {
            Serializer.Serialization.Serialzie(buggedHuman, buggedHuman.getName());
            HumanNotSerializable buggedHumanLOAD = null;
            humanLOAD = Serializer.Serialization.Deserialize(buggedHumanLOAD, buggedHumanLOAD.getName());
            System.out.println("LOADED:" + buggedHumanLOAD.getName());
        }catch(Exception e){
            System.out.println("Error: "+e);
        }





    }
}
