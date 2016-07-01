test("sums the list of numbers in a list") {
    assert(sum(List(1,2,0)) === 3)
    assert(sum(List(1)) === 1)
  }

  test("sum of empty list will return 0") {
    assert(sum(List.empty) === 0)
  }

  test("sum of list with just 1 zero will reuturn 0") {
    assert(sum(List(0)) === 0)
  }

  test("sums the list of numbers that includes negative numbers") {
    assert(sum(List(-1, 2, 3)) === 4)
    assert(sum(List(-1,-5)) === -6)
  }



  test("max of a few numbers") {
    assert(max(List(3, 7, 2)) === 7)
    assert(max(List(3, 0, 2)) === 3)
  }

  test("max of empty will return exception") {
    intercept[IllegalArgumentException] {
      max(List.empty)
    }
  }

  test("max of one number will return that number") {
    assert(max(List(4)) === 4)
  }

  test("max of negative numbers will return bigger number") {
    assert(max(List(-5, 2, -18)) === 2)
    assert(max(List(-1, -2, -3)) === -1)

  }






    def sum(xs: List[Int]): Int = {
    var sum: Int = 0
     for(item <- xs) {
       sum = sum + item
     }
     sum
  }

  def max(xs: List[Int]): Int = {
    if(xs.isEmpty) throw new IllegalArgumentException("empty list is not allowed")
    var bigNumber: Int = xs.head
    for (item <- xs) {
        if (item > bigNumber) bigNumber = item else bigNumber
    }
    bigNumber
  }
