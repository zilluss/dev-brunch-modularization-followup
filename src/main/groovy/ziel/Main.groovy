package ziel
import ziel.printers.PrintName
import ziel.printers.PrintArea
import ziel.elements.Line
import ziel.elements.Circle
import ziel.elements.Rectangle
import ziel.elements.Point

class Main {

  static main(args) {
    def elements = [ 
      new Line(x1: 1, y1: 4, x2: 2, y2: 4),
      new Circle(x: 4, y: 1, radius: 4),
      new Point(x: 3, y: 0),
      new Rectangle(x: 4, y: 1, width: 12, height: 10)]

    def printArea =new PrintAreas()
    def printName = new PrintNames()

    for(element in elements){
      printNames.for(element)
      printAreas.for(element)
      println("---------------------------")
    }
  }
}
