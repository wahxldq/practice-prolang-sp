import jp.kobe_u.copris._
import jp.kobe_u.copris.dsl._

int('x, 1, 15)
int('y, 1, 15)
int('z, 1, 15)
add('x + 'y + 'z === 15)
add('x + 'y * 5 + 'z * 10 === 90)