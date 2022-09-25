public class motorbike extends Transport{
    public motorbike(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {

    }

    @Override
    public void transportService() {
        updateTyre();
    }
}
