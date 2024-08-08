val prices = List(10.0,33.0,35.3,66.9,123.3)


def discountPercentage(price:Double):Double = {
  if (price <20) 0.20
  else if (price <=50) 0.4
  else 0.50
}

def discounts(prices:List[Double],discountFunc:Double =>Double)
