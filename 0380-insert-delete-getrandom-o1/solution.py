class RandomizedSet:

    def __init__(self):
        self.nmap = {}
        self.nlist = []

    def insert(self, val: int) -> bool:
        res = val not in self.nmap
        if res:
            self.nmap[val] = len(self.nlist)
            self.nlist.append(val)
        return res

    def remove(self, val: int) -> bool:
        res = val in self.nmap
        if res:
            idx = self.nmap[val]
            lastval = self.nlist[-1]
            self.nlist[idx] = lastval
            self.nlist.pop()
            self.nmap[lastval] = idx
            del self.nmap[val]
        return res
    def getRandom(self) -> int:
        return random.choice(self.nlist)


# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()
