object Q04{
  def main(args:Array[String])
  {
    //The total wholesale cost for 60 books
    
    var tot_cost :Double  = bookprice(60) - discount(bookprice(60)) + shipping_cost(60)

    printf("Total Amount for 60 copies :- %.2f\n", tot_cost)

  }

  def bookprice(p:Int) :Double = {
      return  p * 24.95
  }

  def discount(amount:Double) : Double ={
      return  amount * 0.4
  }

  def shipping_cost(p:Int) : Double = {
      return   3*p + (p-50)*0.75 
  }

 }
