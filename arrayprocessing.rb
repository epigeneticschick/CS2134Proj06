#arrayprocessing.rb prints the values of an array and reads in the values of an array
# Lorrayya Williams
# March 11, 2019 for CS214
#################################################################



# Input: An array
# The array has contents
# Output: The values of the array
################################################################
def printArray(anArray)
  x = 0
  puts "The array values will be printed below"
  while x < anArray.length
    puts "#{anArray[x]} \n"
    x += 1
  end
end


# Input: An array
# Precondition: The user inputs numbers
# Output a modified array
###############################################################
def readArray(anArray)
  x = 0
  while x < anArray.length
    puts "Add a value to the Array."
    anArray[x] = gets.to_f
    x += 1
  end
end



def main
print "Hello! This program allows you to create, add values to, and print an array \n";
print "What size do you want your array? ";
arraysize = gets.to_i
array = Array.new(arraysize)
readArray(array)
printArray(array)
end

main
