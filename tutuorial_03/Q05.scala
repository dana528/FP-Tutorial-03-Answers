object Q05
{
  def main(args:Array[String])
  {
    var a :Int= easy_phase(2)
    var b :Int= tempo_phase(3)
    var c :Int= easy_phase(2)

    //total running time
    var tot :Int= a+b+c
    println(tot)
  }

  def easy_phase(x:Int) : Int = {
    //running time for easy phase
    return  x*8
  }

  def tempo_phase(y:Int) : Int = {
    //running time for tempo phase
    return y*7
  }

}

