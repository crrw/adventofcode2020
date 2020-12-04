import re
f = open('day4input.txt', 'r')
requirements = {
'byr':r'byr:((19[2-9]\d)|(200[0-2]))',
'iyr':r'iyr:((201\d)|2020)',
'eyr':r'eyr:((202\d)|2030)',
'hgt':r'hgt:(((1(([5-8]\d)|(9[0-3])))cm)|((59)|(6\d)|(7[0-6])in))',
'hcl':r'hcl:#(\d|[a-f]){6}',
'ecl':r'ecl:(amb|blu|brn|gry|grn|hzl|oth)',
'pid':r'pid:\d{9}\D'
}

validDocs = 0
counter = 0
for line in f:
    if line == '\n':
        if counter == 7:
            validDocs += 1
        counter = 0
    else:
        for keys in requirements.keys():
            if re.search(requirements[keys], line) != None:
                counter += 1
print(validDocs+1)
