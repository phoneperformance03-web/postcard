function moveButton() {
    const noBtn = document.getElementById('noBtn');
    const x = Math.random() * (window.innerWidth - 100);
    const y = Math.random() * (window.innerHeight - 50);
    
    noBtn.style.position = 'fixed';
    noBtn.style.left = x + 'px';
    noBtn.style.top = y + 'px';
}

function nextStep() {
    document.querySelector('.step-tag').innerText = 'အဆင့် ( ၂ / ၃ ) ✨';
    document.getElementById('question').innerText =မောင်ကိုမခွဲနိုင်လို့YESနိပ်တာမလား
    အရမ်းချစ်တယ်မမ🥰'😘ent.querySelectorerySelector('.panda-img').src = 'https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExOHp1ZHJxdDFnYzA5a2tpbWZubnZ0Znl4dWx5MnEwb3pzcnE1a3A5eSZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/MDJ9IbxxvDUQM/giphy.gif';
    
    const noBtn = document.getElementById('noBtn');
    noBtn.style.display = 'none';
}
