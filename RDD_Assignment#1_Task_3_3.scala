val file = sc.textFile("If_short.txt")
val c = file.count()
val allWords = file.flatMap(_.split("-"))
val d = allWords.count()
