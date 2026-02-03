package Ex_OOPS_Abstraction.RealExInterfaceKeyword;

public class Car implements Brake, Engine{
    @Override
    public void applyBrake() {

    }

    @Override
    public void startEngine() {
        System.out.println("Start the engine");

    }

    @Override
    public void stopEngine() {

    }

    @Override
    public void haltingEngineJustStart() {
        Engine.super.haltingEngineJustStart();
    }

    @Override
    public void haltingEngineJustStop() {
        Engine.super.haltingEngineJustStop();
    }
}
