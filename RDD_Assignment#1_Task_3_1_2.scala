//Read file
val file = sc.textFile("If.txt")
//Number of rows in file
val c = file.count()
//Number of words in file
val allWords = file.flatMap(_.split("\\s+"))
val d = allWords.count()
//Check for Not null words
val words = allWords.filter(!_.isEmpty)
//Number of Not null words in file
val e = words.count()
//Frequency count of Words
val pairs = words.map((_,1))
val reducedByKey = pairs.reduceByKey(_ + _)
//Top 10 Frequency count
val top10words = reducedByKey.takeOrdered(10)(Ordering[Int].reverse.on(_._2))
