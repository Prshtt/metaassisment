function findMaxNumber(arr) {
  let maxNum = Number.NEGATIVE_INFINITY;

  for (let i = 0; i < arr.length; i++) {
    const element = arr[i];
  
    if (Array.isArray(element)) {
      const nestedMax = findMaxNumber(element);
      maxNum = Math.max(maxNum, nestedMax);
    } else if (typeof element === 'number') {
      maxNum = Math.max(maxNum, element);
    }
  }

  return maxNum;
}

const input = [2, 4, 10, [12, 4, [100, 99], 4], [3, 2, 99], 0];
const result = findMaxNumber(input);

console.log('Maximum number:', result);
