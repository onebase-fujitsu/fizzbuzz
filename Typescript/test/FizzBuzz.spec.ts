import { FizzBuzz } from "../src/FizzBuzz"

describe("FizzBuzz", () => {
    it("returns the string '1' when the number 1 is input", () => {
        const fizzBuzz = new FizzBuzz()

        const result = fizzBuzz.getFizzBuzz(1)
        expect(result).toBe('1')
    })
    it("returns the string '2' when the number 2 is input", () => {})
})