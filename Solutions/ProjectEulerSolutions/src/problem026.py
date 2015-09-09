def find_recurring_cycle(num):
	found_nums = []
	value = 1
	while value != 0 and value not in found_nums:
		found_nums.append(value)
		value *= 10
		value %= num
	return len(found_nums)


if __name__ == '__main__':
	longest_cycle = 0
	for i in range(999, 0, -1):
		cycle_len = find_recurring_cycle(i)
		if cycle_len > longest_cycle:
			longest_cycle = cycle_len
			num_with = i
	print "Num with cycle:", num_with
	print "Cycle length:", longest_cycle