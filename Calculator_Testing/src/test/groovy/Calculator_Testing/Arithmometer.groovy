package Calculator_Testing

import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class Arithmometer extends Specification {
	def "two plus two should equal four"() {
		given:
			int left = 2
			int right = 2
	 
		when:
			int result = left + right
	 
		then:
			result == 5
	}
	def "zero minus minus-one should equal one"() {
		given:
			int left = 0
			int right = -1
	 
		when:
			int result = left - right
	 
		then:
			result == 1
	}
}

