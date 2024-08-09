def ToUpperCase(input: String): String = {
  input.toUpperCase
}


def ToLowerCase(input: String): String = {
  input.toLowerCase
}


def convertString(makeStringUpperCase: Boolean, input: String): String = {
  if (makeStringUpperCase) {
    ToUpperCase(input)
  } else {
    ToLowerCase(input)
  }
}
