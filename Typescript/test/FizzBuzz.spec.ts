import { FizzBuzz } from "../src/FizzBuzz"

describe("FizzBuzz", () => {
    it("returns the string '1' when the number 1 is input", () => {
        const fizzBuzz = new FizzBuzz()
        const result = fizzBuzz.evaluateFizzBuzz(1)

        expect(result).toBe("1")
    })
    it("returns the string 'Fizz' when a multiple of 3 is input", () => {})
})