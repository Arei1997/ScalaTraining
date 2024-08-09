def ToUpperCase(input: String): String = {
  input.toUpperCase
}


def ToLowerCase(input: String): String = {
  input.toLowerCase
}


def convertString(UpperCaseString: Boolean, input: String): String = {
  if (UpperCaseString) {
    ToUpperCase(input)
  } else {
    ToLowerCase(input)
  }
}
