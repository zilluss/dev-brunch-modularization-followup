package ziel.printers
import ziel.elements.Circle
import ziel.elements.Rectangle
import ziel.elements.Element

class PrintArea {
  void of(Circle circle){
    println circle.getName() + "  " + circle.radius*circle.radius* Math.PI
  }

  void of(Rectangle rectangle){
    println rectangle.getName() + "  " + rectangle.width * rectangle.height
  }
  
  void of(Element element){
    println "Can't print area of " + element.getName()
  }
}
