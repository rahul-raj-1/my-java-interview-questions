
Compiler uses valueOf() method to convert primitive to Object nd uses xxxValue() i,e, intValue(), doubleValue() etc to get primitive value from Object.
 specific conversions on primitive types are called the widening primitive conversions:

byte to short, int, long, float, or double
short to int, long, float, or double
char to int, long, float, or double
int to long, float, or double
long to float or double
float to double

Everything else needs an explicit cast. Narrowing is a little more complex:


