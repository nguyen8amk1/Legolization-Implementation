package nttn.legolization.dod_test;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import nttn.legolization.core.Core;

public class NonDOD extends SimpleApplication {
    /* TODO:
        create a cube class with render method
        render an array of cubes to the screen, watch the fps
     */
    public static void main(String[] args) {
        nttn.legolization.render.App app = new nttn.legolization.render.App();
        Core.hello();
        app.start(); // start the game
    }

    @Override
    public void simpleInitApp() {
        Box b = new Box(1, 1, 1); // create cube shape
        Box b2 = new Box(2, 3, 1); // create cube shape
        Box b3 = new Box(3, 5, 1); // create cube shape
        Box b4 = new Box(4, 8, 1); // create cube shape
        Box b5 = new Box(5, 1, 1); // create cube shape
        Geometry geom = new Geometry("Box", b); // create cube geometry from the shape
        Geometry geom2 = new Geometry("Box", b2); // create cube geometry from the shape
        Geometry geom3 = new Geometry("Box", b3); // create cube geometry from the shape
        Geometry geom4 = new Geometry("Box", b4); // create cube geometry from the shape
        Geometry geom5 = new Geometry("Box", b5); // create cube geometry from the shape

        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md"); // create a simple material
        mat.setColor("Color", ColorRGBA.Blue); // set color of material to blue
//        mat.getAdditionalRenderState().setWireframe(true);

        geom.setMaterial(mat); // set the cube's material
        geom2.setMaterial(mat); // set the cube's material
        geom3.setMaterial(mat); // set the cube's material
        geom4.setMaterial(mat); // set the cube's material
        geom5.setMaterial(mat); // set the cube's material
        rootNode.attachChild(geom); // make the cube appear in the scene
        rootNode.attachChild(geom2); // make the cube appear in the scene
        rootNode.attachChild(geom3); // make the cube appear in the scene
        rootNode.attachChild(geom4); // make the cube appear in the scene
        rootNode.attachChild(geom5); // make the cube appear in the scene
    }
}
