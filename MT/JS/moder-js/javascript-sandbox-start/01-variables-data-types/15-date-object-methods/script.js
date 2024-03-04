let x;
let d = new Date()

x = d.toString()

x = d.getTime()
x = d.valueOf()

x = d.getFullYear()

x = d.getMonth() + 1

x = d.getDate()
x = d.getDay()

x = d.getHours()

x = d.getMinutes()
x = d.getSeconds()
x = `${d.getFullYear()}-${d.getMonth() + 1}-${d.getDate()}`

x = Intl.DateTimeFormat("en-US").format(d)
x = Intl.DateTimeFormat("en-GB").format(d)
x = Intl.DateTimeFormat("defoult", { month: "long" }).format(d)

x = d.toLocaleString("default", { month: "short" })

x = d.toLocaleString("default", {
    weekday: "short",
    year: "numeric",
    month: "long",
    day: "numeric",
    hour: "numeric",
    minute: "2-digit",
    second: "2-digit",
    timeZone: "America/New_York"
})
console.log(x);