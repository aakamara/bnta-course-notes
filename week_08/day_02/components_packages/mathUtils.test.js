const mathUtils = require('./mathUtils');

// describe("sum() method test")
//groups of test are called test suite
// describe ("sum() test suite")
/* test("name", () => {
expect(actual).toBe(expected);
}) */

describe("product test cases", () => {
    test("check that it product 4 numbers correctly", () => {
        const actual = mathUtils.product(4, 2, 8, 6);
        const expected = 384;
        expect(actual).toBe(expected);
    })
})

describe("product test cases", () => {
    test("check that it product 5 numbers correctly", () => {
        const actual = mathUtils.product(10, 4, 2, 8, 6);
        const expected = 3840;
        expect(actual).toBe(expected);
    })
})

describe("sum test cases", () => {
    test("check that it sum 6 numbers correctly", () => {
        const actual = mathUtils.sum(10, 20, 4, 2, 8, 6);
        const expected = 50;
        expect(actual).toBe(expected);
    })
})

describe("sum test cases", () => {
    test("check that it sum 4 numbers correctly", () => {
        const actual = mathUtils.sum(4, 2, 8, 6);
        const expected = 20;
        expect(actual).toBe(expected);
    })
})


