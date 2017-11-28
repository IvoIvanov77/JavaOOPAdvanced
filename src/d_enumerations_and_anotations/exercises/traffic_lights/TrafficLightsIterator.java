package d_enumerations_and_anotations.exercises.traffic_lights;

import java.util.Iterator;

public class TrafficLightsIterator implements Iterable<TrafficLights> {

    private TrafficLights start;


    public TrafficLightsIterator(TrafficLights current) {
        this.start = current;

    }



    public TrafficLights getLast() {
        switch (start){
            case RED: return TrafficLights.GREEN;
            case GREEN: return TrafficLights.YELLOW;
            case YELLOW: return TrafficLights.RED;
        }

        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Iterator iterator = this.iterator();
        while(iterator.hasNext()){

            builder.append(iterator.next()).append(" ");
        }
        return builder.toString().trim();
    }

    @Override
    public Iterator<TrafficLights> iterator() {
        return new Iterator<TrafficLights>() {
            private int counter;
            private TrafficLights current = start;
            @Override
            public boolean hasNext() {
//                System.out.println(counter);
                return this.counter < 3;
            }




            @Override
            public TrafficLights next() {
                switch (current){
                    case RED: current = TrafficLights.YELLOW;
                        break;
                    case GREEN: current = TrafficLights.RED;
                        break;
                    case YELLOW: current = TrafficLights.GREEN;
                        break;
                }
                counter ++;
                return current;
            }
        };
    }
}
