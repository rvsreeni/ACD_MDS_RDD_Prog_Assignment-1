//Given a list of numbers 
val nums: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//Find the sum of all numbers
println(nums.sum)
//Find the total elements in the list
println(nums.length)
//Calculate the average of the numbers in the list
val Sum: Float = nums.sum
val Len: Float = nums.length
val Avg: Float = Sum/Len
println(Avg)
//Find the sum of all the even numbers in the list
val even = nums.filter(x => x%2 == 0)
println(even.sum)
//Find the total number of elements in the list divisible by both 5 and 3
val div5and3  = nums.filter(x => ((x%5 == 0) && (x%3 == 0)))
print(div5and3.length)
