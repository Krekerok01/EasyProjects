package decoratorTask.decorators;

import decoratorTask.shapes.Shape;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decorateShape) {
        super(decorateShape);
    }


    private void setBorderColor(Shape decoratedShape){
        System.out.println("Setting the border color for " + decoratedShape.getClass().getSimpleName() + " to red.");
    }

    @Override
    public void draw() {
        setBorderColor(decorateShape);
        decorateShape.draw();
    }
}
