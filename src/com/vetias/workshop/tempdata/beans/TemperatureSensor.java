public  class TemperatureSensor implements Sensor{
        private float temperature;
        public static void main(String[] args) {
            
        }

        public TemperatureSensor(float atemperature)
        {
            temperature = atemperature;
        }
        
        public float getReading() {
                return temperature;
        }

    }
    